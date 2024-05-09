class Book {
    private Type bookType;
    String name;
    String author;

    Book(String name, String author, Type type) {
        this.bookType = type;
        this.name = name;
        this.author = author;
    }
    String getType(){
        switch(bookType){
            case BELLETRE: return "Belletre";
            case SCIENCE: return "Science";
            case SCIENCE_FICTION: return "Science fiction";
            case PHANTASY: return "Phantasy";
            default: return "Undefined";
        }
    }
}