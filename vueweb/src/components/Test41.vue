<template>
  <div id = "test41">
    <button v-on:click = "show = !show">点我</button>
    <transition name="bounce">
      <p v-if="show">好好学习，天天向上！！！</p>
    </transition>
  </div>
</template>

<script>
    export default {
      name: "test41",
      data() {
        return{
          show: false
        }
      }
    }
</script>

<style scoped>
  .bounce-enter-active {
    animation: bounce-in .5s;
  }
  .bounce-leave-active {
    animation: bounce-in .5s reverse;
  }
  @keyframes bounce-in {
    0% {
      transform: scale(0);
    }
    50% {
      transform: scale(1.5);
    }
    100% {
      transform: scale(1);
    }
  }
</style>
