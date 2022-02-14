import java.util.ArrayList;
import java.util.List;

class LoanModel {
    
    Double known;
    Double unknown;
    
}

class LoanCreateService {
    
    private ILoanCreateServiceObservable iLoanCreateServiceObservable;
    
    public LoanCreateService(ILoanCreateServiceObservable iLoanCreateServiceObservable) {
        this.iLoanCreateServiceObservable = iLoanCreateServiceObservable;
    }
    
    public void updateLoan(LoanModel newLoanModel) {
        
        this.iLoanCreateServiceObservable.notify(newLoanModel);
    }
}


//observable interface
interface ILoanCreateServiceObservable {
    void add(List<ILoanCreateServiceObserver> iLoanCreateServiceObservers);
    // void remove(int i);
    void notify(LoanModel loanDetail);
}

//observer interface
interface ILoanCreateServiceObserver {
    void doSomethingAfterUpdate(LoanModel loanDetail);
}


// Observable class implementation
class ILoanCreateServiceObservableImpl implements ILoanCreateServiceObservable {
    
    List<ILoanCreateServiceObserver> observers = new ArrayList<ILoanCreateServiceObserver>();
    
    public void add(List<ILoanCreateServiceObserver> iLoanCreateServiceObservers) {
        observers.addAll(iLoanCreateServiceObservers);
    }
    
    public void notify (LoanModel loanDetail) {
        
        for(int i = 0; i < observers.size(); i++ ) {
            observers.get(i).doSomethingAfterUpdate(loanDetail);
        }
        
    }
   
}


// Observerver implement the same method differently
// observer one
class PrintNewLoan implements ILoanCreateServiceObserver {
    
    public void doSomethingAfterUpdate(LoanModel loanDetail) {
        System.out.println(loanDetail) ;
    }
   
}

// observer two
class PrintEmojis implements ILoanCreateServiceObserver {
    
    public void doSomethingAfterUpdate(LoanModel loanDetail) {
        System.out.println("😂😂😂") ;
    }
   
}
