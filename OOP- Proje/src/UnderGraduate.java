//Lisans Öğrencileri için
public class UnderGraduate extends Student {
    private String Track ;
    
    public UnderGraduate(){
            super();
            Track=null;

    }
    public UnderGraduate(int StudentID,String Name, String Surname,String Track){
        super(StudentID,Name,Surname);
        if (StudentID<0){
            System.out.println("Hata StudentID eksi bir değer alamaz!!");
            System.exit(0);
            
        }
        if(Name==null){
            System.out.println("Hata isim kısmı boş olamaz!");
            System.exit(0);
        }
        if(Surname==null){
            System.out.println("Hata soyisim boş bırakılamaz !");
            System.exit(0);
        }
        this.Track=Track;
    }
public UnderGraduate(UnderGraduate other){
    super(other);
    Track=other.Track;
    
}
    public String toString(){
        String result=super.toString();
        result+=(" , " + getTrack());
                return result;
    }

    /**
     * @return the Track
     */
    public String getTrack() {
        return Track;
    }

    /**
     * @param Track the Track to set
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }
}
