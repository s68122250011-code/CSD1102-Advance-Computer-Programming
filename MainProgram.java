import java.util.Date;

/* ===================== ENUM ===================== */

enum RoleUser {
    PublicRelation,
    Division,
    Manager
}

enum Gender {
    M, F
}

enum StatusProposal {
    Waiting,
    Rejected,
    Accepted
}

/* ===================== CLASS Department ===================== */

class Department {
    private int department_id;
    private String department_name;

    public void insertDepartment() {
        System.out.println("Insert Department");
    }

    public void updateDepartment() {
        System.out.println("Update Department");
    }

    public void deleteDepartment() {
        System.out.println("Delete Department");
    }
}

/* ===================== CLASS Login ===================== */

class Login {
    private String username;
    private String password;

    public boolean loginStatus() {
        System.out.println("Login checking...");
        return true;
    }
}

/* ===================== CLASS User ===================== */

class User {
    private int user_id;
    private int department_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    public void userLogin() {
        System.out.println("User login");
    }

    public void addProposal() {
        System.out.println("Add proposal");
    }

    public void viewProposal() {
        System.out.println("View proposal");
    }

    public void confirmProposal() {
        System.out.println("Confirm proposal");
    }

    public void createReports() {
        System.out.println("Create reports");
    }

    public void viewReports() {
        System.out.println("View reports");
    }

    public void updateDepartment() {
        System.out.println("Update department");
    }
}

/* ===================== CLASS Applicant ===================== */

class Applicant {
    private int applicant_id;
    private String applicant_name;
    private String applicant_job;
    private String applicant_address;
    private Gender applicant_gender;
    private char applicant_tel;

    public void insertApplicant() {
        System.out.println("Insert applicant");
    }

    public void updateApplicant() {
        System.out.println("Update applicant");
    }

    public void deleteApplicant() {
        System.out.println("Delete applicant");
    }
}

/* ===================== CLASS Proposal ===================== */

class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.Waiting;

    public void viewProposal() {
        System.out.println("View proposal");
    }

    public void viewStatus() {
        System.out.println("Proposal status : " + proposal_status);
    }

    public void updateProposal() {
        System.out.println("Update proposal");
    }

    public void deleteProposal() {
        System.out.println("Delete proposal");
    }

    public void archiveProposal() {
        System.out.println("Archive proposal");
    }

    public void viewApplicant() {
        System.out.println("View applicant");
    }
}

/* ===================== CLASS Report ===================== */

class Report {
    private int report_code;
    private Date report_date;

    public void viewReports() {
        System.out.println("View reports");
    }

    public void createReports() {
        System.out.println("Create reports");
    }
}

/* ===================== MAIN ===================== */

public class MainProgram {
    public static void main(String[] args) {

        Login login = new Login();
        login.loginStatus();

        User user = new User();
        user.userLogin();
        user.addProposal();

        Proposal proposal = new Proposal();
        proposal.viewStatus();

        Applicant applicant = new Applicant();
        applicant.insertApplicant();

        Report report = new Report();
        report.createReports();
    }
}