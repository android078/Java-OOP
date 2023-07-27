package User;
public class User {
    public Long id;
    public String name;

    /**
     
     * @param id - порядковый номер Пользователя
     * @param name - имя Пользователя
     */
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public Long getId() {return id;}

    @Override
    public String toString() {
        return String.format("%d,  %s", id, name);
    }

}
