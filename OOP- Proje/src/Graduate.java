//Lisansüstü öğrenciler için
public class Graduate extends Student {
    
    private String Subject;
    private String Advisor;
    
    public Graduate(){
        super();
         Subject=null;
         Advisor=null;
    }
     public Graduate(int StudentID, String Name, String Surname,String Subject, String Advisor){
         super(StudentID,Name,Surname) ;
         
         if(Subject==null){
             System.out.println("Veri hatası Subject boş olamaz");
             System.exit(0);
         }
         if(Advisor==null){
             System.out.println("Veri hatası Advisor boş olamaz");
             System.exit(0);
         }
         this.Subject=Subject;
         this.Advisor=Advisor;
     }
    
     public Graduate(Graduate graduate){
         this.Subject=graduate.Subject;
         this.Advisor=graduate.Advisor;
     }
   public  String toString (){
         String result=super.toString();
         result+=(" , " + getSubject() + " , " + getAdvisor() );
       return result;
     }

    /**
     * @return the Subject
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * @param Subject the Subject to set
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * @return the Advisor
     */
    public String getAdvisor() {
        return Advisor;
    }

    /**
     * @param Advisor the Advisor to set
     */
    public void setAdvisor(String Advisor) {
        this.Advisor = Advisor;
    }
}
