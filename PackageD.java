import samplepackage.PackageDemo;
import samplepackage.PackageDemo1;
//import samplepackage.*; .* => imports all the files in that folder BUT NOT SUBFOLDER
//import java.lang.* => Java by default imports this. Thats the reason System class works without importing the package. 

public class PackageD {
    public static void main(String[] args) {
        PackageDemo pd1 = new PackageDemo();
        PackageDemo1 pd2 = new PackageDemo1();    
    }
}
