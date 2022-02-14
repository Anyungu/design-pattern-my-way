class LoanModel {

    Double known;
    Double unknown;

}

class LoanCreateService {

    private ILoanCreateService iLoanCreateService;

    public LoanCreateService(ILoanCreateService iLoanCreateService) {
        this.iLoanCreateService = iLoanCreateService;
    }

    public LoanModel createLoan(String loanType) {

        if (loanType == "REFINANCE") {
            return this.iLoanCreateService.createRefinance();
        }

        else {
            return this.iLoanCreateService.createPurchase();
        }

    }
}

interface ILoanCreateService {
    LoanModel createRefinance();

    LoanModel createPurchase();
}

class ILoanCreateServiceImpl implements ILoanCreateService {

    public LoanModel createRefinance() {
        return new LoanModel();
    }

    public LoanModel createPurchase() {
        return new LoanModel();
    }
}
