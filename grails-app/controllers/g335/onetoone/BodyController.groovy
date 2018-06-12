package g335.onetoone

class BodyController {

    def bodyService

    def create() {
        render bodyService.createFace()
    }

    def update() {
        render bodyService.updateFace()
    }
}
