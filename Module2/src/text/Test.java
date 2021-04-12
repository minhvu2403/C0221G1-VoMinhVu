package text;

public class Test {
      private String name;
      public String getName(){
          return this.name;
      }
      public void setName(String name){
          this.name=name;
      }

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Test tests =new Test();
        tests.setName("Vu");
        System.out.println("My name is"+tests.getName());
    }
}
