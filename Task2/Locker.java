package Task2;

public class Locker extends Man {

    enum State {
        Closed, Opened
    }

    boolean opened;
    State state;
    
    public Locker() { 
        this.state = State.Closed; 
    }

    public void openCloseLocker () {
            int key = chooseState();
                if (key == 1) {
                    this.state = State.Closed;
                    System.out.printf("%s закрыл шкафчик", name);
                    if (this.state == State.Closed) {
                        openCloseLocker();
                    }
                    
                }
                if (key == 2) {
                    this.state = State.Opened;
                    System.out.printf("%s открыл шкафчик", name);
                }
                if (key == 3) {
                    System.out.printf("Вы вышли из программы.Всего доброго!");
                }
    }
}
