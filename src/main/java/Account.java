public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

/*
     Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
        - в строке не меньше 3 и не больше 19 символов,
        - в строке есть только один пробел,
        - пробел стоит не в начале и не в конце строки.
     Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
 */
    public boolean checkNameToEmboss() {
        if ((name.length() >= 3)
                && (name.length() < 19)
                && (name.split(" ").length == 2)
                && !(name.startsWith(" "))
                && !(name.endsWith(" "))) {
            return true;
        } else return false;
    }
}