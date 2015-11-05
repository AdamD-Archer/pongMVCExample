/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.MySandbox;

/**
 *
 * @author zev
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewModel model = new NewModel();
        NewView view = new NewView();
        NewController controller = new NewController(model, view);
        
        for (int i = 0; i<4; i++){
            controller.displayCount();
        }
    }

    public static class NewModel {
        private int counter;
        
        public NewModel() {
            this.counter = 1;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }
    }

    private static class NewView {

        public NewView() {
        }

        private void displayCount(int counter) {
            switch (counter) {
                case 1:
                    System.out.println("One 1");
                    return;
                case 2:
                    System.out.println("Two 2");
                    return;
                case 3:
                    System.out.println("Three 3");
                    return;
                case 4:
                    System.out.println("Four 4 \n All Done!");
            }
        }
    }

    private static class NewController {
        private final NewModel cModel;
        private final NewView cView;
        
        public NewController(NewModel model, NewView view) {
            this.cModel = model;
            this.cView = view;
        }

        private void displayCount() {
            int counter = this.cModel.getCounter();
            this.cView.displayCount(counter);
            counter++;
            this.cModel.setCounter(counter);
        }
    }
    
}
