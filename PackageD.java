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

/*
                        Private Default Protected   Public
Same Class              Y       Y       Y           Y
Same Package SubClass   N       Y       Y           Y
Same Package Non SubC   N       Y       Y           Y
Diff Package SubClass   N       N       Y           Y
Diff Pacakge Non SubC   N       N       N           Y

General Guidelines:
Classes should be public
One class per file
Instance variable should be private
Method mostly public  
if method or variable wanted to be used in other package subclass then protected
*/