public class SalaryCalculator {
    static double incomeTaxIs;
    static int militaryFeeIs;
    static double pensionSystemis;



    public static double incomeTax (double grossSalary, boolean areYouWorkingAnITCompanyThatEnjoysTaxBenefits){
        if (areYouWorkingAnITCompanyThatEnjoysTaxBenefits){
            incomeTaxIs=(grossSalary*10)/100;
            return incomeTaxIs;
        } else {
            incomeTaxIs=(grossSalary*21)/100;
            return incomeTaxIs;
        }
    }

    public static int militaryFee(double grossSalary){
        if (grossSalary<1){
            return militaryFeeIs=0;
        } else if (grossSalary<100_001){
            return militaryFeeIs=1_500;
        } else if (grossSalary<200_001){
            return militaryFeeIs=3_000;
        } else if (grossSalary<500_001){
            return militaryFeeIs=5_500;
        } else if (grossSalary<1_000_001){
            return militaryFeeIs=8_500;
        } else {
            return militaryFeeIs=15_000;
        }
    }

    public static double pensionSystem (double grossSalary, boolean areYouBornAfter1973,boolean voluntaryParticipationBefore2018July, boolean voluntaryParticipationAfter2018July){
        if(areYouBornAfter1973||voluntaryParticipationBefore2018July){
            if (grossSalary<500_001){
                pensionSystemis=(grossSalary*4.5)/100;
                return pensionSystemis;
            } else if (grossSalary<1_020_001){
                pensionSystemis=((grossSalary*10)/100)-27500;
                return pensionSystemis;
            } else {
                pensionSystemis=74_500;
                return pensionSystemis;
            }
        } else if (voluntaryParticipationAfter2018July){
            if (grossSalary<1_020_001){
                pensionSystemis=(grossSalary*5)/100;
                return pensionSystemis;
            } else {
                pensionSystemis=51_000;
                return pensionSystemis;
            }
        } else {
            pensionSystemis=0;
            return pensionSystemis;
        }

    }


}
