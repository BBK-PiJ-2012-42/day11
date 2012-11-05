package day11;

/**
 *
 * @author tom
 */
public class Ex6Launcher {
    
    public static void main(String[] args) {
        Ex6Launcher launcher = new Ex6Launcher();
        launcher.launch();
    }

    public void launch() {
        Lecturer myLecturer = new Lecturer("Bob");
        System.out.println(myLecturer.getName());
        myLecturer.doResearch("Data Mining");
        myLecturer.teach("Programming with FORTRAN");
    }
    
}
