<template>
  <div id = "test39">
    <button v-on:click = "show = !show">点我</button>
    <transition name = "fade">
      <p v-show = "show" v-bind:style = "styleobj">动画实例</p>
    </transition>
  </div>
</template>

<script>
    export default {
        name: "test39",
      data() {
        return {
          show: true,
          styleobj: {
            fontSize: '30px',
            color: 'red'
          }
        }
      },
      methods : {
      }
    }
</script>

<style scoped>
  /* 可以设置不同的进入和离开动画 */
  /* 设置持续时间和动画函数 */
  .fade-enter-active, .fade-leave-active {
    transition: opacity 2s
  }
  .fade-enter, .fade-leave-to /* .fade-leave-active, 2.1.8 版本以下 */ {
    opacity: 0
  }
</style>
