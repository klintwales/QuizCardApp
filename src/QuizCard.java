public class QuizCard {
    public String question = "Test Question";
    public String answer = "Test Answer";

    public QuizCard(String text, String text1) {
        this.question = "First Question";
        this.answer = "First Answer";
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

}
