package Activity6;

class EmpNotFoundException extends RuntimeException {
    EmpNotFoundException() {
        System.out.println("The Employee for which you are searching for is not found.");
    }
}