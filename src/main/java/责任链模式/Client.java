package 责任链模式;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author : Shadow
 * @className : Client
 * @description :TODO
 * @date : 2021/01/21 18:51
 **/
public class Client {

    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{-2147483648,2147483647}, 1, 1));
        SchoolMasterApprover masterApprover = new SchoolMasterApprover("校长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(masterApprover);

        departmentApprover.processRequest(new PurchaseRequest(1001, 1111, 25000f));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            // 找到大于nums[i]的最小元素
            Integer high = set.ceiling(nums[i]);
            if (high != null && high - nums[i] <= t) {
                return true;
            }
            // 找到小于nums[i]的最大元素
            Integer low = set.floor(nums[i]);
            if (low != null && nums[i] - low <= t) {
                return true;
            }

            set.add(nums[i]);
            // 窗口长度超过k则删除最早放入的元素
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
