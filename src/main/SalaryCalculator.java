public class SalaryCalculator {

    public static double netSalaryCalculator(double grossSalary, boolean areYouWorkingAnITCompanyWithTaxBenefits, boolean areYouBornAfter1973, boolean voluntaryParticipationBefore) {
        double netSalaryIs;
        if (grossSalary > 0) {
            netSalaryIs = grossSalary - incomeTax(grossSalary, areYouWorkingAnITCompanyWithTaxBenefits) - militaryFee(grossSalary) - pensionSystemFee(grossSalary, areYouBornAfter1973, voluntaryParticipationBefore);
            return netSalaryIs;
        } else {
            return netSalaryIs = 0;
        }
    }

    public static double incomeTax(double grossSalary, boolean areYouWorkingAnITCompanyThatEnjoysTaxBenefits) {
        double incomeTaxIs;
        if (areYouWorkingAnITCompanyThatEnjoysTaxBenefits && grossSalary > 0) {
            return incomeTaxIs = (grossSalary * 10) / 100;
        } else if (!areYouWorkingAnITCompanyThatEnjoysTaxBenefits && grossSalary > 0) {
            return incomeTaxIs = (grossSalary * 21) / 100;
        } else {
            return incomeTaxIs = 0;
        }
    }

    public static int militaryFee(double grossSalary) {
        int militaryFeeIs;
        if (grossSalary < 1) {
            return militaryFeeIs = 0;
        } else if (grossSalary < 100_001) {
            return militaryFeeIs = 1_500;
        } else if (grossSalary < 200_001) {
            return militaryFeeIs = 3_000;
        } else if (grossSalary < 500_001) {
            return militaryFeeIs = 5_500;
        } else if (grossSalary < 1_000_001) {
            return militaryFeeIs = 8_500;
        } else {
            return militaryFeeIs = 15_000;
        }
    }

    public static double pensionSystemFee(double grossSalary, boolean areYouBornAfter1973, boolean voluntaryParticipationBefore) {
        double pensionSystemFeeIs;
        if (areYouBornAfter1973 || voluntaryParticipationBefore) {
            if (grossSalary < 500_001) {
                pensionSystemFeeIs = (grossSalary * 4.5) / 100;
                return pensionSystemFeeIs;
            } else if (grossSalary < 1_020_001) {
                pensionSystemFeeIs = ((grossSalary * 10) / 100) - 27500;
                return pensionSystemFeeIs;
            } else if (grossSalary < 1) {
                pensionSystemFeeIs = 0;
                return pensionSystemFeeIs;
            } else {
                pensionSystemFeeIs = 74_500;
                return pensionSystemFeeIs;
            }
        } else if (!voluntaryParticipationBefore) {
            if (grossSalary < 1_020_001) {
                pensionSystemFeeIs = (grossSalary * 5) / 100;
                return pensionSystemFeeIs;
            } else if (grossSalary < 1) {
                pensionSystemFeeIs = 0;
                return pensionSystemFeeIs;
            } else {
                pensionSystemFeeIs = 51_000;
                return pensionSystemFeeIs;
            }
        }
        return 0;
    }

}




