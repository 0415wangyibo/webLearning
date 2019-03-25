<template>
  <div id="test37">
    <input type="radio" id="runoob" value="Runoob" v-model="picked">
    <label for="runoob">Runoob</label>
    <br>
    <input type="radio" id="google" value="Google" v-model="picked">
    <label for="google">Google</label>
    <br>
    <span>选中值为: {{ picked }}</span>
  </div>
</template>

<script>
    export default {
      name: "test37",
      data() {
        return{
          picked : 'Runoob'
        }
      }
    }
</script>

<style scoped>

</style>
