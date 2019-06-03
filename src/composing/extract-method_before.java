void printOwing(){
        printBanner();
        printDetails(getOutstanding());
        }

void printBanner(double outstanding){
        System.out.println("name: "+name);
        System.out.println("amount: "+getOutstanding());
        }