package lesson;

import support.Base;

public class Dropdown {

  public static void handleDropdown() throws InterruptedException {

    Base.selectFromSideBar("Admin");
    Base.selectFromTabBar("Job", "Job Titles");

  }

}
