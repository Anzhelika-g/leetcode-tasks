import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorUnitTest {

    final SalaryCalculator salaryCalculator = new SalaryCalculator();

    @Test
    public void should_return_21_percent_inCaseOf_not_working_an_iT_company_that_enjoys_tax_benefits() {
        double result = salaryCalculator.incomeTax(100_000, false);
        assertEquals(21_000, result);
    }

    @Test
    public void should_return_10_percent_inCaseOf_working_an_iT_company_that_enjoys_tax_benefits() {
        double result = salaryCalculator.incomeTax(100_000, true);
        assertEquals(10_000, result);
    }

    @Test
    public void should_return_0_inCaseOf_zero_gross_salary() {
        double result = salaryCalculator.incomeTax(0, true);
        assertEquals(0.0, result);
    }

    @Test
    public void should_return_1_500_inCaseOf_100_000_gross_salary() {
        double result = salaryCalculator.militaryFee(100_000);
        assertEquals(1_500, result);
    }

    @Test
    public void should_return_3_000_inCaseOf_200_000_gross_salary() {
        double result = salaryCalculator.militaryFee(200_000);
        assertEquals(3_000, result);
    }
    @Test
    public void should_return_5_500_inCaseOf_500_000_gross_salary(){
        double result = salaryCalculator.militaryFee(500_000);
        assertEquals(5_500,result);
    }
    @Test
    public void should_return_8_500_inCaseOf_1000_000_gross_salary(){
        double result = salaryCalculator.militaryFee(1_000_000);
        assertEquals(8_500,result);
    }
    @Test
    public void should_return_15_000_inCaseOf_1_000_001_gross_salary(){
        double result = salaryCalculator.militaryFee(1_000_001);
        assertEquals(15_000,result);
    }
    @Test
    public void should_return_0_inCaseOf_0_gross_salary(){
        double result = salaryCalculator.militaryFee(0);
        assertEquals(0,result);
    }
    @Test
    public void should_return_4_5_percent_inCaseOf_born_after_1973_with_500_000_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(500_000,true,false,false);
        assertEquals(22_500,result);
    }
    @Test
    public void should_return_10_percent_minus_27_500_inCaseOf_born_after_1973_with_1_020_000_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(1_020_000,true,false,false);
        assertEquals(74_500,result);
    }
    @Test
    public void should_return_74_500_inCaseOf_born_after_1973_with_1_020_001_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(1_020_001,true,false,false);
        assertEquals(74_500,result);
    }
    @Test
    public void should_return_zero_inCaseOf_born_after_1973_with_0_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(0,true,false,false);
        assertEquals(0,result);
    }



    @Test
    public void should_return_4_5_percent_inCaseOf_voluntary_participation_before_2018_july_with_500_000_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(500_000,false,true,false);
        assertEquals(22_500,result);
    }
    @Test
    public void should_return_10_percent_minus_27_500_inCaseOf_voluntary_participation_before_2018_july_with_1_020_000_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(1_020_000,false,true,false);
        assertEquals(74_500,result);
    }
    @Test
    public void should_return_74_500_inCaseOf_voluntary_participation_before_2018_july_with_1_020_001_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(1_020_001,false,true,false);
        assertEquals(74_500,result);
    }
    @Test
    public void should_return_zero_inCaseOf_voluntary_participation_before_2018_july_with_0_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(0,false,true,false);
        assertEquals(0,result);
    }

    @Test
    public void should_return_5_percent_inCaseOf_voluntary_participation_after_2018_july_with_1_020_000_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(1_020_000,false,false,true);
        assertEquals(51_000,result);
    }
    @Test
    public void should_return_51_000_inCaseOf_voluntary_participation_after_2018_july_with_1_020_001_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(1_020_001,false,false,true);
        assertEquals(51_000,result);
    }
    @Test
    public void should_return_zero_inCaseOf_voluntary_participation_after_2018_july_with_0_gross_salary(){
        double result = salaryCalculator.pensionSystemFee(0,false,false,true);
        assertEquals(0,result);
    }
    @Test
    public void should_return_zero_inCaseOf_born_before_1973_and_isnt_joined_voluntary(){
        double result = salaryCalculator.pensionSystemFee(100_000,false,false,false);
        assertEquals(0,result);
    }




}

