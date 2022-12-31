package Task2;

public class Locker extends Man {

    enum State {
        Closed, Opened, Out
    }

    State state;
    
    public Locker() { 
        this.state = State.Closed; 
    }

    public void openCloseLocker () {
        int key = chooseState();
        while (this.state != State.Out) {
                if (key == 1) {
                    this.state = State.Closed;
                    System.out.printf("%s закрыл шкафчик", name);
                    break;
                }
                if (key == 2) {
                    this.state = State.Opened;
                    System.out.printf("%s открыл шкафчик", name);
                    break;
                }
                if (key == 3) {
                    System.out.printf("Вы вышли из программы.Всего доброго!");
                    this.state = State.Out;
                }
        }      
    }
}
