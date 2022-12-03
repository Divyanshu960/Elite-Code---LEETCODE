var countQuadruplets = function(nums) {
  let ans = 0;
  let count = [...new Array(300).fill(0)];
  for (let c = nums.length - 1; c > 1; c--) {
    for (let b = c - 1; b > 0; b--) {
      for (let a = b - 1; a >= 0; a--) {
        if (count[nums[a] + nums[b] + nums[c]]) ans += count[nums[a] + nums[b] + nums[c]];
      }
    }
    count[nums[c]]++;
  }
  return ans;
};
