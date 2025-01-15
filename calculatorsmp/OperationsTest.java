package com.mycompany.calculatorsmp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperationsTest {
   public OperationsTest() {
   }

   @BeforeAll
   public static void setUpClass() {
   }

   @AfterAll
   public static void tearDownClass() {
   }

   @BeforeEach
   public void setUp() {
   }

   @AfterEach
   public void tearDown() {
   }

   @Test
   public void testMakeFormula() {
      String formula = Operations.MakeFormula();
      Assertions.assertNotNull(formula);
      Assertions.assertFalse(formula.isEmpty());
      Assertions.assertTrue(formula.matches("^\\d+(\\+|-|\\*|/)\\d+((\\+|-|\\*|/)\\d+)*$"));
   }

   @Test
   public void testSolveAddition() {
      String formula = "2+3";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("2+3=5", result);
   }

   @Test
   public void testSolveMultipleAdditions() {
      String formula = "2+3+4";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("2+3+4=9", result);
   }

   @Test
   public void testSolveSimpleSubtraction() {
      String formula = "10-5";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("10-5=5", result);
   }

   @Test
   public void testSolveMultipleSubtractions() {
      String formula = "10-3-2";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("10-3-2=5", result);
   }

   @Test
   public void testSolveAdditionAndSubtraction() {
      String formula = "10+5-3";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("10+5-3=12", result);
   }

   @Test
   public void testSolveSubtractionAndAddition() {
      String formula = "10-5+3";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("10-5+3=8", result);
   }

   @Test
   public void testSolveMultipleOperations() {
      String formula = "10+5-3+7-2";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("10+5-3+7-2=17", result);
   }

   @Test
   public void testSolveNegativeResult() {
      String formula = "5-10";
      String result = Operations.Solve(formula);
      Assertions.assertEquals("5-10=-5", result);
   }
