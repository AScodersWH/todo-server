package com.thoughtworks.training.tomwang.todoservice;

import com.google.common.collect.ImmutableList;
import com.sun.javafx.collections.ImmutableObservableList;
import com.thoughtworks.training.tomwang.todoservice.model.Tables;
import com.thoughtworks.training.tomwang.todoservice.repository.TablesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TodoServiceApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private TablesRepository tablesRepository;


	@Test

	public void contextLoads() throws Exception {
		when(tablesRepository.list()).thenReturn(ImmutableList.of(new Tables("0","22")));
		MvcResult result = mockMvc
				.perform(get("/tables"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()").value(1))
				.andExpect(jsonPath("$[0].id").value("0"))
				.andExpect(jsonPath("$[0].text").value("22"))
				.andReturn();
	}

}
