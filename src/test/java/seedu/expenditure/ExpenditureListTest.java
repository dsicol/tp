package seedu.expenditure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.Expenditure.AcademicExpenditure;
import seedu.Expenditure.BorrowExpenditure;
import seedu.Expenditure.ExpenditureList;
import seedu.Expenditure.TuitionExpenditure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class ExpenditureListTest {
        private ExpenditureList testExpenditures = new ExpenditureList();

        @BeforeEach
        public void setUp() {
                AcademicExpenditure testAcademicExpenditure = new AcademicExpenditure("Laptop",
                                1500.00, LocalDate.parse("2021-10-10"));
                TuitionExpenditure testTuitionExpenditure = new TuitionExpenditure("NUS Year 2 Semester 2",
                                8000.50, LocalDate.parse("2023-01-20"));
                BorrowExpenditure testBorrowExpenditure = new BorrowExpenditure("School Loan", "BankX",
                                8100.00, LocalDate.parse("2021-07-20"), LocalDate.parse("2025-05-30"));
                testExpenditures.addExpenditure(testAcademicExpenditure);
                testExpenditures.addExpenditure(testTuitionExpenditure);
                testExpenditures.addExpenditure(testBorrowExpenditure);
        }

        @Test
        public void testExpenditureListToString() {
                assertEquals("1. [Academic] || Date: 2021-10-10 || Value: 1500.0 || Description: Laptop\n" +
                                "2. [Tuition] || [ ] || Date: 2023-01-20 || Value: 8000.5 || Description: NUS Year 2 Semester 2\n"
                                +
                                "3. [Borrow] || BankX || Date: 2021-07-20 || Value: 8100.0 || Description: School Loan || 2025-05-30",
                                testExpenditures.toString());
        }

}
