public class TodoList {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println("Command line arguments: \n -l   Lists all the tasks \n -a   Adds a new task \n -r   Removes an task \n -c   Completes an task");
        }
        if(args[0].equals("-l")) {
            Tasks task = new Tasks();
            task.getMyFile("C:\\Users\\Gabi\\greenfox\\TodoApp\\adeakgabi_handle-todo-app\\text.txt");
        }
    }
}
