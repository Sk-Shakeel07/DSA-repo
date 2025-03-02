package _2341001063;

class Member {
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;
    public String getMemberType() {
        return MemberType;
    }

    public int getHandicap() {
        return Handicap;
    }
    public String getTeam() {
        return Team;
    } 

    public char getGender() {
        return Gender;
    }

    public Date getJoinDate() {
        return JoinDate;
    }   
    public Member(int memberId, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        MemberID = memberId;
        LastName = lastName;
        FirstName = firstName;
        Handicap = handicap;
        Gender = gender;
        Team = team;
        MemberType = memberType;
        Coach = coach;
        Phone = phone;
        JoinDate = joinDate;
    }

    public void display() {
        System.out.println("MemberID: " + MemberID);
        System.out.println("LastName: " + LastName);
        System.out.println("FirstName: " + FirstName);
        System.out.println("Handicap: " + Handicap);
        System.out.println("Gender: " + Gender);
        System.out.println("Team: " + Team);
        System.out.println("MemberType: " + MemberType);
        System.out.println("Coach: " + Coach);
        System.out.println("Phone: " + Phone);
        System.out.println("JoinDate: " + JoinDate);
    }

}
    class Date {
        private int day;
        private String month;
        private int year;

        public Date(int day, String month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
 
        public int getDay() {
            return day;
        }

        public String getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public String toString() {
            return day + " " + month + " " + year;
        }
    }


public class Minor_Project {

	public static void main(String[] args) {
		Date joinDate1 = new Date(8, "May", 2004);
        Date joinDate2 = new Date(1, "April", 2009);
        Date joinDate3 = new Date(15, "March", 2000);
        Date joinDate4 = new Date(7, "June", 2010);        
        Date joinDate5 = new Date(7, "February", 2001);
        Member[] members = new Member[5];
        members[0] = new Member(13079, "Priyadarshi Kamila", "Pree Om", 10, 'M', "Team A", "Regular", 0, 9853983332L, joinDate1);
        members[1] = new Member(4141, "Dash", "Priyanka", 15, 'F', "Team B", "Senior", 1, 9124226837L, joinDate2);
        members[2] = new Member(11963, "Nayak", "Rohan", 8, 'M', "Team B", "Senior", 1,  9348989294L, joinDate3);     
        members[3] = new Member(2243, "Behera", "Nishita", 11, 'F', "Team B", "Senior", 1, 9776254914L, joinDate4);
        members[4] = new Member(2354, "Mohapatro", "Siddharth", 18, 'M', "Team A", "Regular", 1,  9568465194L, joinDate5);      
        System.out.println("Members with JoinDate earlier than 07-Apr-09:");
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            if (isBefore(member.getJoinDate(), new Date(7, "April", 2009))) { 
                member.display();
                System.out.println();
            }
        }
        System.out.println("Senior members with handicap less than 12:");
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            if (member.getMemberType().equals("Senior") && member.getHandicap() < 12) {
                member.display();
                System.out.println();
            }
        }
        System.out.println("\nFemale senior members who are part of TeamB:");
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            if (member.getGender() == 'F' && member.getMemberType().equals("Senior") && member.getTeam().equals("Team B")) {
                member.display();
                System.out.println();
            }
        }
    }
    public static boolean isBefore(Date date1, Date date2) {
        if (date1.getYear() < date2.getYear()) {
            return true;
        } else if (date1.getYear() == date2.getYear()) { 
            if (date1.getMonth().compareTo(date2.getMonth()) < 0) {
                return true;
            } else if (date1.getMonth().equals(date2.getMonth())) {
                return date1.getDay() < date2.getDay();
            }
        }
        return false; 
    }
} 
