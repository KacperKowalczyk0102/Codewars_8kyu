public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {

        int count = (s1+s2+s3)/3;
        if( count>=90 && count <= 100) {
            return 'A';
        }else if(count >= 80){
            return 'B';
        }else if(count >=70){
            return 'C';
        }else if(count >=60){
            return 'D';
        }else{
            return 'F';
        }
    }

    public static void main(String[] args) {
        int s1 = 85;
        int s2 = 92;
        int s3 = 78;
        char letterGrade = getGrade( s1, s2, s3);
        System.out.println(letterGrade);
    }
}
