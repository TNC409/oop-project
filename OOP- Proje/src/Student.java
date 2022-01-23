
public class Student {
    
    private int studentID;
    private String Name;
    private String Surname;
    
    public Student(){
        studentID = 0;
        Name = null;
        Surname = null;
    }
    public Student(int studentID, String Name, String Surname){
        this.studentID = studentID;
        this.Name = Name;
        this.Surname = Surname;
        
    }
        public Student(Student student){
        this.studentID = student.studentID;
        this.Name = student.Name;
        this.Surname = student.Surname;
        }
    
    public String toString(){
        String result = ("StudentID: " + getStudentID() +" Name: " + getName() +" Surname: " + getSurname()  );
        return result;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Surname
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * @param Surname the Surname to set
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
    
    
}
