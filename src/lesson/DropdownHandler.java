package lesson;

public class DropdownHandler {

  public static void handleDropdown() throws InterruptedException {

    Base.selectFromSideBar("Admin");
    Base.selectFromTabBar("Job", "Job Titles");

  }

}
