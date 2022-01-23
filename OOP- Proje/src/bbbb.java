
import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class bbbb {
    
    
    public static void main(String[] args) throws IOException, IOException {
        String stringg;
        Student aray[] = new Student[200];
        int[][] array2=new int[200][200];
        int ii=0;
        int k=0;
        int kisi_sayisi=0;
        int ogr_say[]= new int [1];
        
        try {
        FileReader oku= new FileReader("Kurum.txt");
        BufferedReader in =new BufferedReader(oku);
         int i=0;

           while ((stringg =in.readLine())!=null ){
               StringTokenizer satir=new StringTokenizer(stringg ,",");
               System.out.println(satir.nextToken());
             

               

              while (satir.hasMoreElements()){
                  if(i==0){
                      int ogret_say=satir.countTokens();
                      ogr_say[0]=ogret_say;
                   //   for (int x = 0;x<ogret_say;x++){
                          
                    //       int cop=satir.countTokens();
               //       }
                       array2=new int[200][ogret_say];
                       i++;
                    
                  }
                  else if(i%2!=0){
                      String tip=satir.nextToken();
                      if(tip.equals("u")){
                          int ogr_iid=satir.countTokens();
                          String ogr_adi=satir.nextToken();
                          String ogr_soyad=satir.nextToken();
                           String ogr_tez_hocasi=satir.nextToken();
                          UnderGraduate student =new UnderGraduate(ogr_iid,ogr_adi,ogr_soyad,ogr_tez_hocasi);
                          aray[k]=student;
                       i++;
                       kisi_sayisi++;
                       k++;
                      }
                    
                  }
                  else if(i%2==0){
                       for (int kk=0;kk< ogr_say[0];kk++){
                           String temp=satir.nextToken();
                           int result =Integer.parseInt(temp);
                           array2[k][kk-1]=result;
                           
                       }
                       ii++;
                  }
                          String tip2=satir.nextToken();

                      if(tip2.equals("g")){
                          int ogr_iid=satir.countTokens();
                          String ogr_adi=satir.nextToken();
                          String ogr_soyad=satir.nextToken();
                          String dal=satir.nextToken();
                          String advisor2=satir.nextToken();                  
                          Graduate student =new Graduate(ogr_iid,ogr_adi,ogr_soyad,dal,advisor2);
                          aray[k]=student;
                          ii++;
                          k++;
                          kisi_sayisi++;
                      
                      
                  }
              }
              
              }
                          
        } 
        catch (Exception e) {
            System.out.println("Dosya bulunamadı");
            System.exit(0);
        }
        int sayac1 = 0;
        Scanner scan = new Scanner(System.in);
        while ( sayac1 != 200) {
            System.out.println("Öğrencinin Eğitim durumunu giriniz u/U:Lisans g/G :Lisans üstü");
            String e_durumu = scan.nextLine();
            
            
            if (e_durumu.equals("u")|| e_durumu.equals("U")){
                  System.out.println("Öğrencinin numarasını giriniz: ");
            int o_numarasi = scan.nextInt();
                    scan.nextLine();

            System.out.println("Öğrencinin adını giriniz: ");
            String o_ismi = scan.nextLine();
            System.out.println("Öğrencinin soyadını giriniz: ");
            String o_soyismi = scan.nextLine();
            System.out.println("Yüksek lisans tez hocanızın adını giriniz: ");
                       String tez_hocasi =scan.nextLine();
                    Student student=new UnderGraduate(o_numarasi,o_ismi,o_soyismi,tez_hocasi);
                                              aray[k]=student;
                                               k++;
            }
            
            else if(e_durumu.equals("g")|| e_durumu.equals("G")){
                
                     System.out.println("Öğrencinin numarasını giriniz: ");
            int o_numarasi = scan.nextInt();
                    scan.nextLine();

            System.out.println("Öğrencinin adını giriniz: ");
            String o_ismi = scan.nextLine();
            System.out.println("Öğrencinin soyadını giriniz: ");
            String o_soyismi = scan.nextLine();
           
                        System.out.println("Öğrencinin konusunu giriiniz: ");
            String o_konusu=scan.nextLine();
            System.out.println("Öğrencinin izlediği akademiz yolu giriniz: ");
               String o_track = scan.nextLine(); 
               
                       Student student=new Graduate(o_numarasi,o_ismi,o_soyismi,o_konusu,o_track);
                       aray[k]=student;
                                               k++;
            }
        
            
             for(int x=0;x<ogr_say[0]-1;x++){
                 System.out.println(x+1+ ". Öğretmen için puanınızı giriniz: ");
                 int puan=scan.nextInt();
                  array2[k-1][x]=puan;
                 
             }      
            
            System.out.println("Başka Öğrenci yoksa çıkış için q giriniz varsa entera basınız :");
            String cık=scan.nextLine();
             

            if(cık.equals("q")){
                break;
            }
            sayac1++;
        }
        

    }

    private static Student nextToken() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }




    
    

