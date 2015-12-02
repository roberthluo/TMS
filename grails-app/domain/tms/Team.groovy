package tms

class Team {

    String teamName
    boolean isComplete
    static hasMany = [studentAccount:StudentAccount]
    static constraints = {
        teamName size: 5..15, nullable: false, unique: true
        isComplete nullable: false
    }
}
