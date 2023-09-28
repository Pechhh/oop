
import java.util.ArrayList;

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}

class Project {
    private String Description;
    private String ProjectName;

    public Project(String ProjectName, String Description) {
        this.Description = Description;
        this.ProjectName = ProjectName;
    }

    public String getProject() {
        return ProjectName + " : " + Description;
    }
}

class Employee implements Person, Job {
    private String Name;
    private int Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> myProjects;


    public Employee(String name, int age, String position, String empID) {
        this.Name = name;
        this.Age = age;
        this.Position = position;
        this.EmpID = empID;
        this.myProjects = new ArrayList<>();
    }

    public void AddProject(Project project) {
        myProjects.add(project);
    }

    public void showDetails() {
        System.out.println("********************");
        System.out.println("Name : " + getName());
        System.out.println("Position : " + getPosition());
        System.out.println("EmpID : " + getEmpID());
        System.out.println("Project");

        for (Project project : myProjects) {
            System.out.println("         " + project.getProject());
        }
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public String getPosition() {
        return Position;
    }

    @Override
    public void setPosition(String position) {
        this.Position = position;
    }

    @Override
    public String getEmpID() {
        return EmpID;
    }

    @Override
    public void setEmpID(String empID) {
        this.EmpID = empID;
    }
}

public class main {
    public static void main(String[] args) {
        Project project1 = new Project("Web A", "Developing a web application");
        Project project2 = new Project("Mobile app A", "Developing a mobile app");

        Employee employee1 = new Employee("Tom", 30, "UX/UI", "0001");
        employee1.AddProject(project1);
        employee1.AddProject(project2);

        employee1.showDetails();

        Project project3 = new Project("Web A", "Developing a web application");

        Employee employee2 = new Employee("Tim", 25, "Frontend", "002");
        employee2.AddProject(project3);

        employee2.showDetails();
    }
}
