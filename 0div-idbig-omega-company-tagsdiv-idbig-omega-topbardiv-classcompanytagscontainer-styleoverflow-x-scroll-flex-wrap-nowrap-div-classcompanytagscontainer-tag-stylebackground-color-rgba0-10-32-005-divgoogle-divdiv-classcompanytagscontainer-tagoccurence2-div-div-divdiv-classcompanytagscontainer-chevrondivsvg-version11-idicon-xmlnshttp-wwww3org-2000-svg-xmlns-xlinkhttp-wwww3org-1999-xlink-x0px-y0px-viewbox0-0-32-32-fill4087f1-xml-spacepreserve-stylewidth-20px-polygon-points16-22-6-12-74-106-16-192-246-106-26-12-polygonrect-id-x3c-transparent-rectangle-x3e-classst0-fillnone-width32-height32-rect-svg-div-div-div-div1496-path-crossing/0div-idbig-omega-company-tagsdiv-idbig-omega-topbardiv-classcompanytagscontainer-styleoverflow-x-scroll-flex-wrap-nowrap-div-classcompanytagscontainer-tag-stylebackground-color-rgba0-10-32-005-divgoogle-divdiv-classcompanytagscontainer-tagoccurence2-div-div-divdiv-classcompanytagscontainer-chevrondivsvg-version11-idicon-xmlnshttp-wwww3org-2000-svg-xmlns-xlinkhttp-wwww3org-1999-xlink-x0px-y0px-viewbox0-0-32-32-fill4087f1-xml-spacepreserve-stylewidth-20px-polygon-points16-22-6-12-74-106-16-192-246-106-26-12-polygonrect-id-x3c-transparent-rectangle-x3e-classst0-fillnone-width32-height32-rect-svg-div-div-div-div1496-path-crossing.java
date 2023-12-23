class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visitedPoints = new HashSet<>();
        int currentX =0,currentY =0;
        visitedPoints.add(currentX+","+currentY);

        for(int i =0;i<path.length();i++){
            if(path.charAt(i)=='N') currentY++;
            else if(path.charAt(i)=='S') currentY--;
            else if(path.charAt(i)=='E') currentX++;
            else currentX--;

            String point = currentX+","+currentY;
            if(visitedPoints.contains(point)){
                return true;
            }
            visitedPoints.add(point);
        }
        return false;
    }
}