package chapter5;

public class Autopolicytest {
    public static void main(String[] args) {
        Autopolicy policy1=new Autopolicy(11111111,"Toyota camry","NJ");

        Autopolicy policy2=new Autopolicy(22222222,"Ford fusion","MF");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    private static void policyInNoFaultState(Autopolicy policy1) {
        System.out.println("The auto poolicy:");

        System.out.printf("Account #:%d;car:%s;%nstate %s %s a no fault state%n%n",
                policy1.getAccountnumber(),policy1.getMakeandModel(),policy1.getState(),
                (policy1.isnotfaultstate() ? "is":"is not"));
    }
}
