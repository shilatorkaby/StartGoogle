package class7.exs2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class JobPosition {
    final DateFormat PublishedDate; //
    final String title; //
    final String description;
    final String location; //Default: ‘Tel Aviv
    final float salary;
    final boolean isRemote; //
    final int YearsOfExperienceRequired;


    public static class Builder {
        //Required Parameters
        DateFormat PublishedDate;
        String title;
        boolean isRemote;

        //Optional Parameters
        String location= "Tel Aviv";

        //default values
        String description;
        float salary;
        int YearsOfExperienceRequired;


        public Builder(DateFormat PublishedDate, String title, boolean isRemote) {
            this.PublishedDate = PublishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder description() {
            this.description = "missing description";
            return this;
        }

        public Builder salary() {
            this.salary = ThreadLocalRandom.current().nextFloat(8000,15000);
            return this;
        }
        public Builder YearsOfExperienceRequired() {
            this.YearsOfExperienceRequired = ThreadLocalRandom.current().nextInt(10);
            return this;
        }


        public JobPosition build() {
            return new JobPosition(this);
        }
    }

    private JobPosition(Builder builder) {
        this.PublishedDate=builder.PublishedDate;
        this.title=builder.title;
        this.description=builder.description;
        this.location=builder.location;
        this.salary=builder.salary;
        this.isRemote=builder.isRemote;
        this.YearsOfExperienceRequired=builder.YearsOfExperienceRequired;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "PublishedDate=" + PublishedDate.format(new Date()) +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isRemote=" + isRemote +
                ", YearsOfExperienceRequired=" + YearsOfExperienceRequired +
                '}';
    }

    public static void main(String[] args) {
        JobPosition position = new Builder(new SimpleDateFormat("01/02/2022"),"Programmer",true).salary().YearsOfExperienceRequired().build();
        System.out.println(position);
    }
}