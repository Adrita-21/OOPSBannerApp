public class OOPSBannerApp{
    public static void main(String[]args){
        String[]lines = {
        System.out.println(String.join("  ***  " ,"   ***  ","  ******  ","    *****  "));
        System.out.println(String.join(" **  ** "," **  ** ","  **     ** "," **         "));
        System.out.println(String.join("**    **"," **    **","  **      **","**          "));
        System.out.println(String.join("**    **"," **    **","  **     ** "," **     "));
        System.out.println(String.join("**    **"," **    **","  *******   ","  ***       "));
        System.out.println(String.join("**    **"," **    **","  **        ","     **     "));
        System.out.println(String.join("**    **"," **    **","  **        ","      **     "));
        System.out.println(String.join(" **  ** ","  **  ** ","  **        ","     **      "));
        System.out.println(String.join("  ***   ", "   ***   ","  **        "," *****       "));   
        }
        for (String line : lines) 
        {
            System.out.println(line); 
        }
    }

}