class Solution {

    // coopied as I haven't studied graph and D.P yet
    class Course {
        int prerequisiteCount;
        int latestStartTime;
        int duration;
        int[] nextCourses;
        int nextCoursesCount;
        Course(int dur) {
            prerequisiteCount = 0;
            latestStartTime = 0;
            duration = dur;
            nextCourses = new int[10];
            nextCoursesCount = 0;
        }        
    }
    
    public int minimumTime(int n, int[][] relations, int[] time) {
        Course[] courses = new Course[n + 1];
        for (int i = n; i > 0; i--)  courses[i] = new Course(time[i - 1]);
        
        for (int[] relation : relations) {
            Course c = courses[relation[0]];
            if (c.nextCoursesCount == c.nextCourses.length)
                c.nextCourses = Arrays.copyOf(c.nextCourses, c.nextCourses.length * 10);
            c.nextCourses[c.nextCoursesCount++] = relation[1];
            courses[relation[1]].prerequisiteCount++;
        }
        int[] courseStack = new int[n];
        int courseStackCount = 0;
        for (int i = n; i > 0; i--)
            if (courses[i].prerequisiteCount == 0)
                courseStack[courseStackCount++] = i;
        
        int finishTime = 0;
        while (courseStackCount > 0) {
            Course c = courses[courseStack[--courseStackCount]];
            int courseEnd = c.latestStartTime + c.duration;
            finishTime = Math.max(finishTime, courseEnd);
            for (int i = c.nextCoursesCount - 1; i >= 0; i--) {
                int nextNum = c.nextCourses[i];
                courses[nextNum].latestStartTime = 
                            Math.max(courses[nextNum].latestStartTime, courseEnd);
                if (--courses[nextNum].prerequisiteCount == 0)
                    courseStack[courseStackCount++] = nextNum;
            }
        }
        return finishTime;
    }
}