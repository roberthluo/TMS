package tms

class TeamController {
    def TeamService

    def index() {

        render (view:"teamList")
    }


    //NEVER put stuff in parameters unless if private
    def acceptNewStudent(){
        String  userId = params.userId
        String teamId = params.teamId

    }

    def createTeam(){
        String teamName = params.teamName
        String teamId = params.teamId
        boolean isComplete = params.team
        String teamPoolId = params.teamName

        redirect(controller: "")
    }

    def quitTeam(){

        String teamId = params.teamId
        StudentAccount studentAccount = params.studentAccount
    }


    def joinTeam() {
        String userId = params.userId
        String teamId = params.teamId
        render (view: "teamList")
    }

    def visualizeStudentTeam() {
        //def teams = Team.list()
        //[teams:teams]
        render (view: "teamList")
    }
}
