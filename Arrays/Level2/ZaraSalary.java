package Arrays.Level2;

public class ZaraSalary {
    public static void main(String[] args) {
        double[] salary = {50,80,90,70,60,30,20};
        double[] serviceYear = {5,8,4,3,2,7,6};

        double[] bonus = new double[7];
        double[] newSalary = new double[7];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i=0;i<7;i++){
            if(serviceYear[i]>5){
                bonus[i] = salary[i]*0.05;
            } else{
                bonus[i] = salary[i]*0.02;
            }
            newSalary[i]=bonus[i]+salary[i];

            totalBonus = totalBonus+bonus[i];
            totalOldSalary=totalOldSalary+salary[i];
            totalNewSalary=totalNewSalary+newSalary[i];
        }
        for (int i = 0;i<7;i++){
            System.out.println("Employee "+(i+1)+" Old Salary "+ salary[i]+" New Salary "+newSalary[i]+" Bonus "+bonus[i]);
        }
        System.out.println(totalNewSalary);
        System.out.println(totalOldSalary);
        System.out.println(totalBonus);
    }
}
