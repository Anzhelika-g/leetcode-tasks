import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryCalculatorIntegrationTest {
    final SalaryCalculator salaryCalculator = new SalaryCalculator();
    @Test
    public void should_return_73_000_inCaseOf_100_000_gross_salary(){
        double result = salaryCalculator.netSalaryCalculator(100_000,false,true,false, false);
        assertEquals(73_000, result);
    }
    @Test
    public void should_return_84_000_inCaseOf_100_000_gross_salary_with_work_in_iT_company(){
        double result = salaryCalculator.netSalaryCalculator(100_000,true,true,false, false);
        assertEquals(84_000, result);
    }
    @Test
    public void should_return_789_934_000_inCaseOf_1_000_000_000_gross_salary_with_work_in_iT_company(){
        double result = salaryCalculator.netSalaryCalculator(1_000_000_000,false,false,false, true);
        assertEquals(789_934_000, result);
    }
    @Test
    public void should_return_zero_inCaseOf_zero_gross_salary_with_work_in_iT_company(){
        double result = salaryCalculator.netSalaryCalculator(0,true,true,false, false);
        assertEquals(0, result);
    }
    @Test
    public void should_return_zero_inCaseOf_minus_gross_salary_with_work_in_iT_company(){
        double result = salaryCalculator.netSalaryCalculator(-1,true,true,false, false);
        assertEquals(0, result);
    }


}
