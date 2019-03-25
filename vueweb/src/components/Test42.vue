<template>
  <div id = "test43">
    <button v-on:click = "show = !show">点我</button>
    <transition
      name="custom-classes-transition"
      enter-active-class="animated tada"
      leave-active-class="animated bounceOutRight"
    >
      <p v-if="show">好好学习，天天向上！！！</p>
    </transition>
  </div>
</template>

<script>
    export default {
      name: "test42",
      data() {
        return{
          show: true
        }
      }
    }
</script>

<style scoped>

</style>
