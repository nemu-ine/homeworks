package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start, end;

    DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod compare) {
        if (checkIfAllOverlay(compare) || checkIfSame(compare)) {
            return new DatePeriod(this.start, this.end);
        }
        if (checkIfInverseOverlay(compare)) {
            return new DatePeriod(compare.start, compare.end);
        }
        if (checkIfLatter(compare)) {
            LocalDate tempStart = compare.start;
            LocalDate tempEnd = compare.end;
            compare.setStartEnd(this.start, this.end);
            this.setStartEnd(tempStart, tempEnd);
        }
        if (checkIfOneDay(compare)) {
            return new DatePeriod(this.end, compare.start);
        }
        if (checkForOverlap(compare)) {
            return new DatePeriod(compare.start, end);
        }
        return null;
    }

    public void setStartEnd (LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public boolean checkIfAllOverlay(DatePeriod compare) {
        return (this.start.isAfter(compare.start) && this.end.isBefore(compare.end));
    }

    public boolean checkIfInverseOverlay(DatePeriod compare) {
        return (compare.start.isAfter(this.start) && compare.end.isBefore(this.end));
    }

    public boolean checkIfLatter(DatePeriod compare) {
        return compare.start.isBefore(this.start);
    }

    public boolean checkIfSame(DatePeriod compare) {
        return this.start.equals(compare.start) && this.end.equals(compare.end);
    }

    public boolean checkIfOneDay(DatePeriod compare) {
        return this.end.toString().equals(compare.start.toString());
    }

    public boolean checkForOverlap(DatePeriod compare) {
        return compare.start.isBefore(this.end);
    }

    public String toString() {
        return this.start + " and " + this.end;
    }

}
