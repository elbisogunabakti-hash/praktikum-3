package packageimport.library.model;

public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void info() {
        System.out.println("Anggota: " + name + " (ID: " + memberId + ")");
    }
}
