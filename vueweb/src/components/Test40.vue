<template>
  <div id = "test40">
    <button v-on:click = "show = !show">点我</button>
    <transition name="slide-fade">
      <p v-if="show">好好学习，天天向上</p>
    </transition>
  </div>
</template>

<script>
    export default {
      name: "test40",
      data() {
        return{
          show: true
        }
      }
    }
</script>

<style scoped>
  /* 可以设置不同的进入和离开动画 */
  /* 设置持续时间和动画函数 */
  .slide-fade-enter-active {
    transition: all .3s ease;
  }
  .slide-fade-leave-active {
    transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
  }
  .slide-fade-enter, .slide-fade-leave-to
    /* .slide-fade-leave-active 用于 2.1.8 以下版本 */ {
    transform: translateX(10px);
    opacity: 0;
  }
</style>
