import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String[]students={"a","b","c","d","e","f"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh");
        String name=scanner.nextLine();
        boolean check=false;
        for (int i=0;i<students.length;i++){
            if(students[i].equals(name)){
                System.out.println("danh sach hoc sinh la"+ name +"is" +(i+1));
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("khong thay"+name+"trong danh sach");
        }
    }
}
