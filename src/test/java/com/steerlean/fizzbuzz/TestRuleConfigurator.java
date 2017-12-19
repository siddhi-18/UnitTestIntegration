package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;

import org.mockito.Mock;
import org.mockito.Mockito;
public class TestRuleConfigurator {
  @Test
  public void testConfigure() {
	  //Arrange
	  
	 @Mocked
	 RuleFactory factory;
	 
	  List<IRule> expectedList = new ArrayList<IRule>();  
			  
	  
	  //Act
	  List<IRule> result = rConfigure.configure();
	  
	  //Assert
  }
}
