import java.util.*
import java.io.*;
import java.util.Date;

class exe_13 {
    public static void main(String[] args) {
        File f = new File(args[0]);
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isHidden());
        System.out.println(new Date(f.lastModified()));
		
		if (f.isDirectory()){
			File fname[] = f.listFiles();
			for(File fn : fname){
				if (fn.getName().endsWith(".java"))
					System.out.println(fn.getName()+" "+(new Date(f.lastModified())));
			}
		}
    }
}